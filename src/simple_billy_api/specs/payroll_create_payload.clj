(ns simple-billy-api.specs.payroll-create-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.extra-payment :refer :all]
            )
  (:import (java.io File)))


(def payroll-create-payload-data
  {
   (ds/req :employee_ids) (s/coll-of uuid?)
   (ds/opt :extra_payments) (s/coll-of extra-payment-spec)
   (ds/req :month) int?
   (ds/req :year) int?
   })

(def payroll-create-payload-spec
  (ds/spec
    {:name ::payroll-create-payload
     :spec payroll-create-payload-data}))
