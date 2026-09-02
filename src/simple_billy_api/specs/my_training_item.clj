(ns simple-billy-api.specs.my-training-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.assignment-status :refer :all]
            )
  (:import (java.io File)))


(def my-training-item-data
  {
   (ds/req :assignmentId) uuid?
   (ds/opt :certificateId) string?
   (ds/req :code) string?
   (ds/opt :description) string?
   (ds/opt :dueDate) inst?
   (ds/opt :lastScore) int?
   (ds/req :passScore) int?
   (ds/opt :passed) boolean?
   (ds/req :status) assignment-status-spec
   (ds/req :title) string?
   (ds/req :trainingId) uuid?
   (ds/opt :validUntil) inst?
   })

(def my-training-item-spec
  (ds/spec
    {:name ::my-training-item
     :spec my-training-item-data}))
