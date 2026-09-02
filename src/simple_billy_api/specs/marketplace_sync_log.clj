(ns simple-billy-api.specs.marketplace-sync-log
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.sync-log-status :refer :all]
            [simple-billy-api.specs.sync-type :refer :all]
            )
  (:import (java.io File)))


(def marketplace-sync-log-data
  {
   (ds/opt :completedAt) inst?
   (ds/req :connectionId) string?
   (ds/opt :errorMessage) string?
   (ds/req :itemsFailed) int?
   (ds/req :itemsSynced) int?
   (ds/req :platform) string?
   (ds/req :startedAt) inst?
   (ds/req :status) sync-log-status-spec
   (ds/req :syncType) sync-type-spec
   })

(def marketplace-sync-log-spec
  (ds/spec
    {:name ::marketplace-sync-log
     :spec marketplace-sync-log-data}))
