(ns simple-billy-api.specs.activity-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.activity-type :refer :all]
            [simple-billy-api.specs.activity-status :refer :all]
            )
  (:import (java.io File)))


(def activity-update-data
  {
   (ds/opt :activityType) activity-type-spec
   (ds/opt :assignedTo) string?
   (ds/opt :contactId) string?
   (ds/opt :description) string?
   (ds/opt :dueDate) inst?
   (ds/opt :reminderDate) inst?
   (ds/opt :status) activity-status-spec
   (ds/opt :subject) string?
   })

(def activity-update-spec
  (ds/spec
    {:name ::activity-update
     :spec activity-update-data}))
