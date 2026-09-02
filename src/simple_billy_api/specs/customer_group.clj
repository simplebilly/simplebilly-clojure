(ns simple-billy-api.specs.customer-group
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customer-group-data
  {
   (ds/opt :description) string?
   (ds/opt :memberIds) (s/coll-of string?)
   (ds/opt :membershipFilter) string?
   (ds/req :name) string?
   })

(def customer-group-spec
  (ds/spec
    {:name ::customer-group
     :spec customer-group-data}))
