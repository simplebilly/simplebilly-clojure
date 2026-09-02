(ns simple-billy-api.specs.allocate-payment-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def allocate-payment-request-data
  {
   (ds/req :amount) float?
   (ds/req :invoice_id) string?
   (ds/req :payment_id) uuid?
   })

(def allocate-payment-request-spec
  (ds/spec
    {:name ::allocate-payment-request
     :spec allocate-payment-request-data}))
