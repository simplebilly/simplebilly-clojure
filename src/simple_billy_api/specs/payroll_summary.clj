(ns simple-billy-api.specs.payroll-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.payroll-month :refer :all]
            )
  (:import (java.io File)))


(def payroll-summary-data
  {
   (ds/req :firstName) string?
   (ds/opt :hourlyGross) string?
   (ds/req :id) uuid?
   (ds/req :jobTitle) string?
   (ds/req :lastName) string?
   (ds/opt :monthlySalary) string?
   (ds/req :months) (s/coll-of payroll-month-spec)
   (ds/opt :weeklyHours) string?
   (ds/req :year) int?
   })

(def payroll-summary-spec
  (ds/spec
    {:name ::payroll-summary
     :spec payroll-summary-data}))
