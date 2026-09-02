(ns simple-billy-api.specs.open-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.reminder-level :refer :all]
            )
  (:import (java.io File)))


(def open-item-data
  {
   (ds/req :amount_due) string?
   (ds/req :amount_paid) string?
   (ds/opt :customer_id) string?
   (ds/opt :days_overdue) int?
   (ds/opt :due_date) string?
   (ds/req :invoice_id) string?
   (ds/req :invoice_number) string?
   (ds/req :issue_date) string?
   (ds/req :open_amount) string?
   (ds/req :reminder_level) reminder-level-spec
   })

(def open-item-spec
  (ds/spec
    {:name ::open-item
     :spec open-item-data}))
