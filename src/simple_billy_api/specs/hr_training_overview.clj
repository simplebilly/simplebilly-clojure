(ns simple-billy-api.specs.hr-training-overview
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def hr-training-overview-data
  {
   (ds/req :assignedCount) int?
   (ds/req :code) string?
   (ds/req :completedCount) int?
   (ds/req :overdueCount) int?
   (ds/req :title) string?
   (ds/req :trainingId) uuid?
   })

(def hr-training-overview-spec
  (ds/spec
    {:name ::hr-training-overview
     :spec hr-training-overview-data}))
