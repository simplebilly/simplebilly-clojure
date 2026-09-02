(ns simple-billy-api.specs.payroll-summary-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.payroll-run-status :refer :all]
            )
  (:import (java.io File)))


(def payroll-summary-item-data
  {
   (ds/req :employee_count) int?
   (ds/req :month) string?
   (ds/req :status) payroll-run-status-spec
   (ds/req :total_employer_cost) string?
   (ds/req :total_gross) string?
   (ds/req :total_net) string?
   (ds/req :year) int?
   })

(def payroll-summary-item-spec
  (ds/spec
    {:name ::payroll-summary-item
     :spec payroll-summary-item-data}))
