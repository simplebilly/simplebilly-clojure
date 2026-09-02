(ns simple-billy-api.specs.sync-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def sync-status-data
  {
   })

(def sync-status-spec
  (ds/spec
    {:name ::sync-status
     :spec sync-status-data}))
