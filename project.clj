(defproject aleph-graal "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :plugins [[io.taylorwood/lein-native-image "0.3.1"]]
  :native-image {:name "aleph-graal"
                 :graal-bin "/opt/graalvm/bin"
                 :opts ["--no-fallback"
                        "--report-unsupported-elements-at-runtime"
                        "--initialize-at-build-time"
                        "--allow-incomplete-classpath"
                        "--initialize-at-run-time=io.netty.channel.DefaultFileRegion"
                        "--initialize-at-run-time=io.netty.channel.epoll.Epoll"
                        "--initialize-at-run-time=io.netty.channel.epoll.Native"
                        "--initialize-at-run-time=io.netty.channel.epoll.EpollEventLoop"
                        "--initialize-at-run-time=io.netty.channel.epoll.EpollEventArray"
                        "--initialize-at-run-time=io.netty.channel.unix.Errors"]}
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [aleph "0.5.0"]]
  :repl-options {:init-ns aleph-graal.core}
  :main aleph-graal.core)
