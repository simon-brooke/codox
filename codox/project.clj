(defproject codox "0.10.7-cloverage"
  :description "Generate documentation from Clojure source files"
  :url "https://github.com/weavejester/codox"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [org.clojure/clojurescript "1.7.189"]
                 [org.clojure/data.zip "1.0.0"]
                 [cloverage "1.3.0-SNAPSHOT"] ;; yes, this is the current master version as of 20210610
                 [hiccup "1.0.5"]
                 [enlive "1.1.6"]
                 [org.pegdown/pegdown "1.6.0"]
                 [org.ow2.asm/asm-all "5.0.3"]]
  :plugins [[lein-cloverage "1.3.0-SNAPSHOT"]])
