(ns simple-billy-api.specs.public-return-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.public-return-item :refer :all]
            )
  (:import (java.io File)))


(def public-return-request-data
  {
   (ds/req :email) string?
   (ds/req :items) (s/coll-of public-return-item-spec)
   (ds/opt :notes) string?
   (ds/req :orderNumber) string?
   })

(def public-return-request-spec
  (ds/spec
    {:name ::public-return-request
     :spec public-return-request-data}))
