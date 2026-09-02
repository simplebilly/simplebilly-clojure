(ns simple-billy-api.specs.datev-booking-preview
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def datev-booking-preview-data
  {
   (ds/req :account_number) string?
   (ds/req :debit_credit) string?
   (ds/req :document_date) string?
   (ds/req :document_text) string?
   (ds/req :net_amount) string?
   (ds/req :opposite_account) string?
   (ds/opt :tax_amount) string?
   (ds/opt :tax_rate) string?
   })

(def datev-booking-preview-spec
  (ds/spec
    {:name ::datev-booking-preview
     :spec datev-booking-preview-data}))
