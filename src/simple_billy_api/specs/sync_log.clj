(ns simple-billy-api.specs.sync-log
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sync-log-data
  {
   (ds/opt :completed_at) inst?
   (ds/req :connection_id) string?
   (ds/opt :error_message) string?
   (ds/req :items_failed) int?
   (ds/req :items_synced) int?
   (ds/req :log_id) string?
   (ds/req :platform) string?
   (ds/req :started_at) inst?
   (ds/req :status) string?
   (ds/req :sync_type) string?
   })

(def sync-log-spec
  (ds/spec
    {:name ::sync-log
     :spec sync-log-data}))
