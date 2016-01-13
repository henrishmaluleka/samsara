(defproject samsara/samsara-logger (-> "../../samsara.version" slurp .trim)
  :description "A logging interface for sending logs as events to samsara"
  :url "https://github.com/samsara/samsara-logger"
  :license {:name "Apache License V2"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.slf4j/slf4j-api "1.7.12"]
                 [org.apache.logging.log4j/log4j-core "2.3"]
                 [samsara/samsara-client #=(clojure.string/trim #=(slurp "../../samsara.version"))]]
  :aot [samsara.logger.EventLogger samsara.logger.EventLoggerBuilder]

  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :test-paths ["test/main/clojure"]

  :prep-tasks ["compile" "javac"]

  :deploy-repositories[["clojars" {:url "https://clojars.org/repo/"
                                   :sign-releases true}]]
  )




