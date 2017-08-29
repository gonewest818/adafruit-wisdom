(defproject adafruit-wisdom "0.8.0-SNAPSHOT"
  :description "Pulls one of the quotes at random from the footer of http://www.adafruit.com"
  :url "https://github.com/gonewest818/adafruit-wisdom"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojars.scsibug/feedparser-clj "0.4.0"]
                 [clj-http "3.7.0"]]
  :main adafruit-wisdom.core)
