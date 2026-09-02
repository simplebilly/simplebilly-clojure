(ns simple-billy-api.specs.budget-goal-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def budget-goal-request-data
  {
   (ds/req :monthly_goal) string?
   (ds/req :year) int?
   })

(def budget-goal-request-spec
  (ds/spec
    {:name ::budget-goal-request
     :spec budget-goal-request-data}))
