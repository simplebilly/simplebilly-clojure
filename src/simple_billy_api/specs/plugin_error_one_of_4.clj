(ns simple-billy-api.specs.plugin-error-one-of-4
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-one-of-4-data
  {
   (ds/req :DatabaseError) (s/coll-of any?)
   })

(def plugin-error-one-of-4-spec
  (ds/spec
    {:name ::plugin-error-one-of-4
     :spec plugin-error-one-of-4-data}))
