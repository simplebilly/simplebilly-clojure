(ns simple-billy-api.specs.customer-group-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customer-group-create-data
  {
   (ds/opt :description) string?
   (ds/opt :memberIds) (s/coll-of string?)
   (ds/opt :membershipFilter) string?
   (ds/req :name) string?
   })

(def customer-group-create-spec
  (ds/spec
    {:name ::customer-group-create
     :spec customer-group-create-data}))
