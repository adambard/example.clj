(defproject example "0.1.0-SNAPSHOT"
  :description "A wee example project demonstrating the (very) basics of Compojure and Ring"
  :url "http://adambard.com/blog/Getting-started-with-Clojure-web-apps/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [de.ubercode.clostache/clostache "1.3.1"]]
  :main example.core)
