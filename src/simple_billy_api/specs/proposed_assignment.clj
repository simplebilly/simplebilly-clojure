(ns simple-billy-api.specs.proposed-assignment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def proposed-assignment-data
  {
   (ds/req :amount_paid) string?
   (ds/req :confidence) float?
   (ds/opt :customer_id) string?
   (ds/req :invoice_id) string?
   (ds/req :invoice_number) string?
   (ds/req :open_amount) string?
   (ds/req :payment_date) string?
   (ds/req :payment_id) uuid?
   (ds/req :reason) string?
   (ds/opt :reference) string?
   })

(def proposed-assignment-spec
  (ds/spec
    {:name ::proposed-assignment
     :spec proposed-assignment-data}))
