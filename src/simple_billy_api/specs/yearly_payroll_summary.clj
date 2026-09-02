(ns simple-billy-api.specs.yearly-payroll-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.payroll-summary-item :refer :all]
            )
  (:import (java.io File)))


(def yearly-payroll-summary-data
  {
   (ds/req :avg_employee_count) int?
   (ds/req :months) (s/coll-of payroll-summary-item-spec)
   (ds/req :year) int?
   (ds/req :yearly_employer_cost) string?
   (ds/req :yearly_gross) string?
   (ds/req :yearly_net) string?
   })

(def yearly-payroll-summary-spec
  (ds/spec
    {:name ::yearly-payroll-summary
     :spec yearly-payroll-summary-data}))
