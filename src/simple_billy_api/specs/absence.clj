(ns simple-billy-api.specs.absence
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.absence-type :refer :all]
            [simple-billy-api.specs.absence-status :refer :all]
            )
  (:import (java.io File)))


(def absence-data
  {
   (ds/opt :absenceType) absence-type-spec
   (ds/opt :approvedAt) inst?
   (ds/opt :approvedBy) uuid?
   (ds/opt :createdAt) inst?
   (ds/opt :deletedAt) inst?
   (ds/opt :employeeId) uuid?
   (ds/opt :endDate) inst?
   (ds/opt :id) uuid?
   (ds/opt :notes) string?
   (ds/opt :startDate) inst?
   (ds/opt :status) absence-status-spec
   (ds/opt :tenantId) uuid?
   (ds/opt :updatedAt) inst?
   })

(def absence-spec
  (ds/spec
    {:name ::absence
     :spec absence-data}))
