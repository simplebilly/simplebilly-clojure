(ns simple-billy-api.specs.service-job-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.service-job-status :refer :all]
            )
  (:import (java.io File)))


(def service-job-update-data
  {
   (ds/opt :address) string?
   (ds/opt :customerEmail) string?
   (ds/opt :customerId) uuid?
   (ds/opt :customerName) string?
   (ds/opt :customerPhone) string?
   (ds/opt :description) string?
   (ds/opt :estimatedDurationMinutes) int?
   (ds/opt :lat) float?
   (ds/opt :lng) float?
   (ds/opt :notes) string?
   (ds/opt :status) service-job-status-spec
   })

(def service-job-update-spec
  (ds/spec
    {:name ::service-job-update
     :spec service-job-update-data}))
