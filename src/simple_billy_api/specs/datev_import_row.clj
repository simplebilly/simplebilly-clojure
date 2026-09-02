(ns simple-billy-api.specs.datev-import-row
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def datev-import-row-data
  {
   (ds/req :account) string?
   (ds/req :amount) string?
   (ds/req :base_amount) string?
   (ds/req :base_currency) string?
   (ds/req :booking_text) string?
   (ds/req :bu_key) string?
   (ds/req :cost_center1) string?
   (ds/req :cost_center2) string?
   (ds/req :currency) string?
   (ds/req :debit_credit) string?
   (ds/req :discount) string?
   (ds/req :document_date) string?
   (ds/req :document_field2) string?
   (ds/req :document_number) string?
   (ds/req :eu_country_vat_id) string?
   (ds/req :eu_tax_rate) string?
   (ds/req :exchange_rate) string?
   (ds/req :opposite_account) string?
   })

(def datev-import-row-spec
  (ds/spec
    {:name ::datev-import-row
     :spec datev-import-row-data}))
