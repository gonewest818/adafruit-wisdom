(ns adafruit-wisdom.core
 (:require [clj-http.client :as client]
           [feedparser-clj.core :refer [parse-feed]])
 (:gen-class))

(defn -main
  [& args]
  (let [fruit (-> (client/get "http://adafruit.com/feed/quotes.xml")
                  :body
                  .getBytes
                  java.io.ByteArrayInputStream.)
        quote (-> fruit
                  parse-feed
                  :entries
                  rand-nth
                  :title)]
    (println quote)))

