(ns simple-billy-api.specs.absence-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.absence-type :refer :all]
            [simple-billy-api.specs.absence-status :refer :all]
            )
  (:import (java.io File)))


(def absence-update-data
  {
   (ds/opt :absenceType) absence-type-spec
   (ds/opt :approvedAt) inst?
   (ds/opt :approvedBy) uuid?
   (ds/opt :employeeId) uuid?
   (ds/opt :endDate) inst?
   (ds/opt :notes) string?
   (ds/opt :startDate) inst?
   (ds/opt :status) absence-status-spec
   })

(def absence-update-spec
  (ds/spec
    {:name ::absence-update
     :spec absence-update-data}))
