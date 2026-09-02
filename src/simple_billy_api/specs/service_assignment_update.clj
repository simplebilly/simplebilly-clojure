(ns simple-billy-api.specs.service-assignment-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.service-assignment-status :refer :all]
            )
  (:import (java.io File)))


(def service-assignment-update-data
  {
   (ds/opt :employeeId) uuid?
   (ds/opt :jobId) uuid?
   (ds/opt :notes) string?
   (ds/opt :scheduledDate) inst?
   (ds/opt :scheduledEnd) string?
   (ds/opt :scheduledStart) string?
   (ds/opt :status) service-assignment-status-spec
   })

(def service-assignment-update-spec
  (ds/spec
    {:name ::service-assignment-update
     :spec service-assignment-update-data}))
