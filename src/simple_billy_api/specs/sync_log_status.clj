(ns simple-billy-api.specs.sync-log-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sync-log-status-data
  {
   })

(def sync-log-status-spec
  (ds/spec
    {:name ::sync-log-status
     :spec sync-log-status-data}))
