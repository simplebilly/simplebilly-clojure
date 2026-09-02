(ns simple-billy-api.specs.dpa-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dpa-status-data
  {
   (ds/req :accepted) boolean?
   (ds/opt :acceptedAt) string?
   (ds/opt :acceptedBy) string?
   (ds/opt :version) string?
   })

(def dpa-status-spec
  (ds/spec
    {:name ::dpa-status
     :spec dpa-status-data}))
