(ns simple-billy-api.specs.customer-group-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customer-group-update-data
  {
   (ds/opt :description) string?
   (ds/opt :memberIds) (s/coll-of string?)
   (ds/opt :membershipFilter) string?
   (ds/opt :name) string?
   })

(def customer-group-update-spec
  (ds/spec
    {:name ::customer-group-update
     :spec customer-group-update-data}))
