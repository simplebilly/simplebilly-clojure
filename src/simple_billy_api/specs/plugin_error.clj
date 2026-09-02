(ns simple-billy-api.specs.plugin-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-data
  {
   (ds/req :BadRequest) (s/coll-of any?)
   (ds/req :NotFound) (s/coll-of any?)
   (ds/req :Unauthorized) (s/coll-of any?)
   (ds/req :InternalError) (s/coll-of any?)
   (ds/req :DatabaseError) (s/coll-of any?)
   (ds/req :ValidationError) (s/coll-of any?)
   (ds/req :NotImplemented) string?
   })

(def plugin-error-spec
  (ds/spec
    {:name ::plugin-error
     :spec plugin-error-data}))
