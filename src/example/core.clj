(ns example.core
  (:use compojure.core)
  (:require
    [ring.adapter.jetty :as jetty]
    [clostache.parser :as clostache]))

; Template Rendering
(defn read-template [template-name]
  (slurp (clojure.java.io/resource (str "templates/" template-name ".mustache"))))

(defn render-template [template-file params]
   (clostache/render (read-template template-file) params))

; View functions
(defn index []
  (render-template "index" {:greeting "Bonjour"}))

; Routing
(defroutes main-routes
  (GET "/" [] (index)))

; Server
(defn -main []
  (jetty/run-jetty main-routes {:port 5000}))
