(ns simple-billy-api.specs.budget
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def budget-data
  {
   (ds/req :category) string?
   (ds/req :monthlyGoal) string?
   (ds/opt :updatedAt) inst?
   (ds/req :year) int?
   })

(def budget-spec
  (ds/spec
    {:name ::budget
     :spec budget-data}))
