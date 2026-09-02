(ns simple-billy-api.specs.create-channel-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def create-channel-dto-data
  {
   (ds/req :channel_type) string?
   (ds/req :config) any-type-spec
   (ds/req :name) string?
   })

(def create-channel-dto-spec
  (ds/spec
    {:name ::create-channel-dto
     :spec create-channel-dto-data}))
