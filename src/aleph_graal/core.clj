(ns aleph-graal.core
  (:require [aleph.http :as http])
  (:gen-class))

(defn start-server []
  (http/start-server (constantly {:body "Hello!"}) {:port 8080}))

(defn -main [& _]
  (start-server))
