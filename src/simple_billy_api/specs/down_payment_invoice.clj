(ns simple-billy-api.specs.down-payment-invoice
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def down-payment-invoice-data
  {
   (ds/opt :contact_id) string?
   (ds/opt :contact_name) string?
   (ds/req :created_at) string?
   (ds/req :currency) string?
   (ds/req :id) string?
   (ds/opt :notes) string?
   (ds/req :paid_amount) string?
   (ds/req :total_amount) string?
   (ds/req :voucher_date) inst?
   (ds/opt :voucher_number) string?
   (ds/req :voucher_status) string?
   })

(def down-payment-invoice-spec
  (ds/spec
    {:name ::down-payment-invoice
     :spec down-payment-invoice-data}))
