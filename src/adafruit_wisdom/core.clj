(ns adafruit-wisdom.core
 (:require [clj-http.client :as client]
           [hickory.select :as s]
           [hickory.core :as h])
 (:gen-class))


(defn -main
  [& args]
  (let [fruit (-> (client/get "http://adafruit.com")
                  :body
                  h/parse
                  h/as-hickory)
        quote (-> (s/select (s/and (s/tag :span)
                                   (s/or (s/class "quotes-large") 
                                         (s/class "quotes-medium")))
                            fruit)
                  first
                  :content
                  first)
        authr (-> (s/select (s/child (s/class "quotes_author")
                                     (s/tag :a))
                            fruit)
                  first
                  :content
                  first)]
    (println (str quote " - " authr))))


;; (-main)

