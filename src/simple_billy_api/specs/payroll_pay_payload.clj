(ns simple-billy-api.specs.payroll-pay-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def payroll-pay-payload-data
  {
   (ds/req :payment_date) inst?
   })

(def payroll-pay-payload-spec
  (ds/spec
    {:name ::payroll-pay-payload
     :spec payroll-pay-payload-data}))
