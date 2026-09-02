(ns simple-billy-api.specs.service-assignment-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.service-assignment-status :refer :all]
            )
  (:import (java.io File)))


(def service-assignment-create-data
  {
   (ds/opt :employeeId) uuid?
   (ds/opt :jobId) uuid?
   (ds/opt :notes) string?
   (ds/opt :scheduledDate) inst?
   (ds/opt :scheduledEnd) string?
   (ds/opt :scheduledStart) string?
   (ds/opt :status) service-assignment-status-spec
   })

(def service-assignment-create-spec
  (ds/spec
    {:name ::service-assignment-create
     :spec service-assignment-create-data}))
