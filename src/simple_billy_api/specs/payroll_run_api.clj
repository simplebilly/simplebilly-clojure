(ns simple-billy-api.specs.payroll-run-api
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.payroll-entry-api :refer :all]
            [simple-billy-api.specs.payroll-run-status :refer :all]
            )
  (:import (java.io File)))


(def payroll-run-api-data
  {
   (ds/opt :approved_at) inst?
   (ds/opt :approved_by) uuid?
   (ds/req :created_at) inst?
   (ds/req :entries) (s/coll-of payroll-entry-api-spec)
   (ds/req :month) int?
   (ds/opt :payment_date) inst?
   (ds/req :period_label) string?
   (ds/req :run_id) uuid?
   (ds/req :status) payroll-run-status-spec
   (ds/req :tenant_id) uuid?
   (ds/req :total_employee_count) int?
   (ds/req :total_employer_cost) string?
   (ds/req :total_gross) string?
   (ds/req :total_net) string?
   (ds/req :total_social_security) string?
   (ds/req :total_taxes) string?
   (ds/opt :updated_at) inst?
   (ds/req :year) int?
   })

(def payroll-run-api-spec
  (ds/spec
    {:name ::payroll-run-api
     :spec payroll-run-api-data}))
