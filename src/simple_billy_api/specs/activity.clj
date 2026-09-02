(ns simple-billy-api.specs.activity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.activity-type :refer :all]
            [simple-billy-api.specs.activity-status :refer :all]
            )
  (:import (java.io File)))


(def activity-data
  {
   (ds/req :activityType) activity-type-spec
   (ds/opt :assignedTo) string?
   (ds/opt :contactId) string?
   (ds/opt :description) string?
   (ds/opt :dueDate) inst?
   (ds/opt :reminderDate) inst?
   (ds/req :status) activity-status-spec
   (ds/req :subject) string?
   })

(def activity-spec
  (ds/spec
    {:name ::activity
     :spec activity-data}))
