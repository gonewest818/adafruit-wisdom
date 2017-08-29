(ns adafruit-wisdom.core
 "core namespace contains the main function and all logic"
 (:require [clj-http.client :as client]
           [feedparser-clj.core :refer [parse-feed]])
 (:gen-class))

(defn -main
  "parse adafruit's rss feed of quotes and print one at random"
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
