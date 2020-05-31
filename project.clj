(defproject imprudentia-api "1.0.0-SNAPSHOT"
  :description "Demo Clojure web app"
  :url "http://imprudentia-api.herokuapp.com"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [environ "1.1.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "imprudentia-api-standalone.jar"
  :profiles {:production {:env {:production true}}}
  :main ^{:skip-aot true} imprudentia-api.web)
