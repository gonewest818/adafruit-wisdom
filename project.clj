(defproject adafruit-wisdom "0.8.0-SNAPSHOT"
  :description "Pulls one of the quotes at random from the footer of http://www.adafruit.com"
  :url "https://github.com/gonewest818/adafruit-wisdom"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [hickory "0.5.4"]
                 [clj-http "2.0.0"]]
  :main adafruit-wisdom.core)
