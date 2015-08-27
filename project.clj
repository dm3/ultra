(defproject venantius/ultra "0.3.7-SNAPSHOT"
  :description "Ultra: A Leiningen plugin for a superior development environment"
  :url "http://github.com/venantius/ultra"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.nrepl "0.2.10"]

                 [io.aviso/pretty "0.1.18"]
                 [mvxcvi/whidbey "1.0.0"]
                 [mvxcvi/puget "0.8.1"]
                 [org.clojars.brenton/google-diff-match-patch "0.1"]
                 [robert/hooke "1.3.0"]
                 [venantius/glow "0.1.2"]]
  :test-selectors {:default (complement :demo)
                   :demo :demo}
  :eval-in-leiningen true)
