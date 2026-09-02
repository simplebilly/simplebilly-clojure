(ns simple-billy-api.specs.training-assignment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.assignment-status :refer :all]
            )
  (:import (java.io File)))


(def training-assignment-data
  {
   (ds/opt :assignedBy) uuid?
   (ds/opt :createdAt) inst?
   (ds/opt :deletedAt) inst?
   (ds/opt :dueDate) inst?
   (ds/opt :employeeId) uuid?
   (ds/opt :id) uuid?
   (ds/opt :notes) string?
   (ds/opt :status) assignment-status-spec
   (ds/opt :tenantId) uuid?
   (ds/opt :trainingId) uuid?
   (ds/opt :updatedAt) inst?
   })

(def training-assignment-spec
  (ds/spec
    {:name ::training-assignment
     :spec training-assignment-data}))
