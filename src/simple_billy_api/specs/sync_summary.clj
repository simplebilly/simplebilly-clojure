(ns simple-billy-api.specs.sync-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sync-summary-data
  {
   (ds/opt :error_message) string?
   (ds/opt :items_failed) int?
   (ds/opt :items_synced) int?
   })

(def sync-summary-spec
  (ds/spec
    {:name ::sync-summary
     :spec sync-summary-data}))
