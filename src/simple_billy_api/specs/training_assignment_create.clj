(ns simple-billy-api.specs.training-assignment-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.assignment-status :refer :all]
            )
  (:import (java.io File)))


(def training-assignment-create-data
  {
   (ds/opt :assignedBy) uuid?
   (ds/opt :dueDate) inst?
   (ds/opt :employeeId) uuid?
   (ds/opt :notes) string?
   (ds/opt :status) assignment-status-spec
   (ds/opt :trainingId) uuid?
   })

(def training-assignment-create-spec
  (ds/spec
    {:name ::training-assignment-create
     :spec training-assignment-create-data}))
