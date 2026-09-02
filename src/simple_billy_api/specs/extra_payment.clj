(ns simple-billy-api.specs.extra-payment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def extra-payment-data
  {
   (ds/req :amount) string?
   (ds/req :employee_id) uuid?
   (ds/opt :reason) string?
   })

(def extra-payment-spec
  (ds/spec
    {:name ::extra-payment
     :spec extra-payment-data}))
