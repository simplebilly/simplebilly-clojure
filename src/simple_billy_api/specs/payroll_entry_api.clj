(ns simple-billy-api.specs.payroll-entry-api
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.employee :refer :all]
            [simple-billy-api.specs.payroll-run-status :refer :all]
            )
  (:import (java.io File)))


(def payroll-entry-api-data
  {
   (ds/req :av_employee) string?
   (ds/req :av_employer) string?
   (ds/req :church_tax_amount) string?
   (ds/opt :employee) employee-spec
   (ds/req :employee_id) uuid?
   (ds/req :entry_id) uuid?
   (ds/opt :extra_payment_reason) string?
   (ds/req :extra_payments) string?
   (ds/req :gross_salary) string?
   (ds/req :kv_employee) string?
   (ds/req :kv_employer) string?
   (ds/req :lohnsteuer) string?
   (ds/req :net_salary) string?
   (ds/opt :notes) string?
   (ds/req :pv_employee) string?
   (ds/req :pv_employer) string?
   (ds/req :run_id) uuid?
   (ds/req :rv_employee) string?
   (ds/req :rv_employer) string?
   (ds/req :sick_days) int?
   (ds/req :soli) string?
   (ds/req :status) payroll-run-status-spec
   (ds/req :total_deductions) string?
   (ds/req :total_employer_cost) string?
   (ds/req :vacation_days_used) int?
   })

(def payroll-entry-api-spec
  (ds/spec
    {:name ::payroll-entry-api
     :spec payroll-entry-api-data}))
