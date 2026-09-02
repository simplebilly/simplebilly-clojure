(ns simple-billy-api.specs.payment-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def payment-condition-data
  {
   (ds/req :discount_days) int?
   (ds/req :discount_percentage) float?
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :payment_term_days) int?
   })

(def payment-condition-spec
  (ds/spec
    {:name ::payment-condition
     :spec payment-condition-data}))
