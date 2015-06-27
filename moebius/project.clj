(defproject samsara/moebius "0.3.0-SNAPSHOT"
  :description "A system to process and enrich and correlate events in realtime"

  :url "https://samsara.github.com/"

  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [prismatic/schema "0.4.3"]                ;; schema validation
                 [com.taoensso/timbre "4.0.1"]             ;; logging
                 ;;[samsara/trackit "0.2.0"]
                 [org.clojure/core.match "0.3.0-alpha4"]   ;; pattern-matching
                 [potemkin "0.3.13"]                       ;; import-var
                 [com.brunobonacci/where "0.1.0"]          ;; where
                 [rhizome "0.2.5"]                         ;; graphviz
                 ]

  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.3"]]}}

  :deploy-repositories [["clojars" {:url "https://clojars.org/repo/"
                                   :sign-releases false}]])
