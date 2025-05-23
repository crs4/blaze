(ns blaze.db.node.resource-indexer.spec
  (:require
   [blaze.db.kv.spec]
   [blaze.db.node.resource-indexer :as-alias resource-indexer]
   [blaze.db.resource-store.spec]
   [blaze.db.search-param-registry.spec]
   [blaze.executors :as ex]
   [clojure.spec.alpha :as s]))

(s/def ::resource-indexer/executor
  ex/executor?)

(s/def ::resource-indexer/num-threads
  pos-int?)

(s/def :blaze.db.node/resource-indexer
  (s/keys
   :req-un
   [:blaze.db/kv-store
    :blaze.db/resource-store
    :blaze.db/search-param-registry
    ::resource-indexer/executor]))
